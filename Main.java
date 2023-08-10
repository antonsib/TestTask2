import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String, String> yesterday = new HashMap<>();
       yesterday.put("first.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Моя первая страница</title></head><body>1</body></html>");
       yesterday.put("second.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Моя вторая страница</title></head><body>2</body></html>");
       yesterday.put("third.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Моя третья страница</title></head><body>3</body></html>");
       yesterday.put("delete.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Удаленная страница</title></head><body>4</body></html>");
       
       HashMap<String, String> today = new HashMap<>();
       today.put("first.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Моя первая страница</title></head><body>1</body></html>");
       today.put("second.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Моя вторая страница</title></head><body>2</body></html>");
       today.put("third.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Моя страница</title></head><body>3</body></html>");
       today.put("new.ru", "<!DOCTYPE html><html lang='ru'><head><meta charset='UTF-8'><title>Моя новая страница</title></head><body>3</body></html>");
       
       ArrayList<String> newValues =new ArrayList<>();
       ArrayList<String> deletedValues =new ArrayList<>();
       ArrayList<String> changedValues =new ArrayList<>();
       
       yesterday.forEach((key, value) -> {
           if(today.containsKey(key)){
               if(today.containsValue(value)) {}
               else changedValues.add(key);
           }
           else deletedValues.add(key);
       });
       
       today.forEach((key, value) -> {
           if(yesterday.containsKey(key)){}
           else newValues.add(key);
       });
       
       System.out.println("Здравствуйте, дорогая и.о. секретаря\nЗа последние сутки во вверенных Вам сайтах произошли следующие изменения:/n");
       System.out.println("Удалены следующие страницы:");
       System.out.println(deletedValues);
       System.out.println("Появились следующие новые страницы:");
       System.out.println(newValues);
       System.out.println("Изменились следующие страницы:");
       System.out.println(changedValues);
       System.out.println("С уважением,\nавтоматизированная система мониторинга.");
	}
}
