package ca.sheridancollege.trenholg.passwordstoretrenholg.controllers;

import ca.sheridancollege.trenholg.passwordstoretrenholg.beans.PasswordRecord;
import ca.sheridancollege.trenholg.passwordstoretrenholg.databases.DatabaseAccess;
import ca.sheridancollege.trenholg.passwordstoretrenholg.utilities.RandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private DatabaseAccess databaseAccess;

    @GetMapping("/")
    public String index(Model model) {
        PasswordRecord passwordRecord = new PasswordRecord();
        passwordRecord.setID(RandomNumberGenerator.genLongID());
        model.addAttribute("passwordRecord", passwordRecord);
        return "Index"; }

    @PostMapping("/addRecord")
    public String addRecord(@ModelAttribute PasswordRecord passwordRecord, Model model) {
        databaseAccess.save(passwordRecord);
        model.addAttribute("passwordRecord", new PasswordRecord());
        return "Index";
    }

    @GetMapping("/view")
    public String view(Model model) {
        List<PasswordRecord> records = (List<PasswordRecord>) databaseAccess.findAll();
        model.addAttribute("passwordRecords", records);
        return "viewPasswordRecord"; }

    @GetMapping("/search")
    public String search() { return "searchPasswordRecord"; }


}
