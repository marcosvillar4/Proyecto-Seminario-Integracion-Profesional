
package tpo.seminario.breakbuddy.ui.ranking

import com.google.firebase.functions.FirebaseFunctions
import com.google.firebase.functions.FirebaseFunctionsException

data class RankingItem(val name: String, val points: Int, val rank: Int)

class RankingRepository {
    private val functions = FirebaseFunctions.getInstance()


    fun getGroupRanking(
        groupId: String,
        onSuccess: (List<RankingItem>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val data = mapOf("groupId" to groupId)
        functions
            .getHttpsCallable("getGroupRanking")
            .call(data)
            .addOnSuccessListener { result ->
                val payload = result.data as? Map<*, *> ?: run {
                    onFailure("Respuesta inválida del servidor")
                    return@addOnSuccessListener
                }
                @Suppress("UNCHECKED_CAST")
                val raw = payload["ranking"] as? List<Map<String, Any>> ?: emptyList()
                val list = raw.mapNotNull { entry ->
                    val name = entry["name"] as? String ?: return@mapNotNull null
                    val pts  = (entry["points"] as? Number)?.toInt() ?: 0
                    val rnk  = (entry["rank"]   as? Number)?.toInt() ?: 0
                    RankingItem(name, pts, rnk)
                }
                onSuccess(list)
            }
            .addOnFailureListener { e ->
                val msg = (e as? FirebaseFunctionsException)
                    ?.details
                    ?.let { (it as? Map<*, *>)?.get("message") as? String }
                    ?: e.message
                    ?: "Error cargando ranking"
                onFailure(msg)
            }
    }
}
