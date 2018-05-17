import java.util.*;

public class test {
    public static void main(String[] args) throws SupplyInventoryException {
//        execption exe = new execption();
//        try {
//            exe.test();
//        } catch (SupplyInventoryException e) {
//            throw new SupplyInventoryException("nihao", e);
//        }

        Map<Integer, String> maps = new HashMap<>();
        int type = 1;
        for (int i = 0; i < 2; i++) {
            if (type == 1){
                maps.put(type, "{\"levelMap\":{\"1\":1,\"3\":2},\"levelEnumMap\":{\"ONE_LEVEL_STOCK\":1,\"THREE_LEVEL_STOCK\":2},\"ruleType\":\"PRIORITY\"}");

            }else {
                maps.put(type, "{\"startTime\":\"00:00:00\",\"endTime\":\"18:00:00\",\"ruleType\":\"DATETIME_LIMIT\"}");
            }
            type++;
        }
        System.out.println(maps);


        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 1);
        map.put(2, 1);

        List<Integer> list = new LinkedList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            for (int i = 0; i < value; i++) {
                list.add(key);
            }
        }
        System.out.println(list);

        Random rd = new Random();
        List<Person> result = new ArrayList<>();
        int stockTypeIdx = 0;
        int currentStockType = 0;
        for (int i = 0; i < 2; i++) {
            if (list.isEmpty()){
                currentStockType = rd.nextInt(5)+1;
            }else{
                currentStockType = list.get(stockTypeIdx++);
            }
            if (true){
                Person person = new Person();
                person.setAge(currentStockType);
                result.add(person);
            }else {
                int currentNum = 1;

                for (int j = 0; j < 2; j++) {

                    Person person = new Person();
                    person.setAge(currentNum++);
                    result.add(person);
                }
            }
        }
        for (Person person : result) {
            System.out.println(person.getAge());
        }
        List<Long> ruleList = new ArrayList<>();
        ruleList.add(1L);
        ruleList.add(2L);
        ruleList.add(3L);
        StringBuffer ruleStr = new StringBuffer();
        for (Long rule : ruleList) {
            System.out.println(rule);
        }
        for (int i = 0; i < ruleList.size(); i++) {
            if (i != ruleList.size() - 1){
                ruleStr.append(ruleList.get(i));
                ruleStr.append(",");
            }else {
                ruleStr.append(ruleList.get(i));
            }
        }
        System.out.println(ruleStr.toString());

    }
}
