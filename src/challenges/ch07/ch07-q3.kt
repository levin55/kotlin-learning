import java.awt.Image
import java.time.LocalDateTime

data class TwitterMessage(var userimage: Image,var username: String,
                          var userhashname: String,var time: LocalDateTime,
                            var text: String,var commentIdx:Int,
                          var comment:Array<String>,var retwitIdx:Int,
                            var retwitmember:Array<String>,var likeIdx:Int,
                            var likemember:Array<String>)