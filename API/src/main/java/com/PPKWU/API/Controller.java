package com.PPKWU.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/API")
    public String giveStringInfo(@RequestParam String str){
        StringInfo info = new StringInfo();
        info.countAll(str);
        return "Podany string posiada:<br>"+ info.numbersOfUpper + " - znaków zapisanych wielką literą<br>"
                + info.numbersOfLower + " - znaków zapisanych małą literą<br>"
                + info.numbersOfNumbers + " - znaków będących cyfrą<br>"
                + info.numbersOfSpecialChar + " - znaków specjalnych<br>"
                + str.length() + " - suma znaków.";
    }

    @GetMapping("/")
    public String help(){
        return "Aby skorzystać z zaimplementowanej funkcjonalności jako endpoint należy do URL dopisać - \"/API?str=\" a po znaku \"=\" dowolny tekst.";
    }
}
