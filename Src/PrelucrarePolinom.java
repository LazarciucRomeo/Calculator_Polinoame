//"\"\\\\s*([-+]?[0-9]+(\\\\.[0-9]*)?)[*\\\\s]?(\\""

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrelucrarePolinom {
    public static Polinom token(String s) {
        Polinom p = new Polinom();

        int coef = 0;
        int grad = 0;

        Pattern o = Pattern.compile("(-?\\b\\d+)[xX]\\^(-?\\d+\\b)");
        Matcher m = o.matcher(s);
        while (m.find()) {
            coef = Integer.parseInt(m.group(1));
            grad = Integer.parseInt(m.group(2));
            Monom mon = new Monom(coef, grad);
           p.adugaremonoame(mon);
        }

        return p;
    }

}