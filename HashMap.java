import java.util.HashMap;
class Test
{
public static void main(String[] args)
{
HashMap<String,String> map = new HashMap<>();
map.put("abc@gmail.com","abc@123");
map.put("xyz@yahoo.com","xyz@321"); 
map.put("bbc@rediff.com","redbbc");
map.put("someuser@xyz.com","somexyz");
System.out.println(map.size());
System.out.println(map.get("xyz@yahoo.com"));
}
}
