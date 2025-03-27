package Stream_api;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getName(){
        return Optional.of("Kunal");
    }
    public static void main(String[] args) {

        String str=null;

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
        System.out.println(optional.hashCode());
        System.out.println(optional.orElse("str me null value hai"));

        Optional<String> name = getName();
        System.out.println(name.get());

    }
}
