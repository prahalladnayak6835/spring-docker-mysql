package pd.example.springmysqldockerimage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pd.example.springmysqldockerimage.model.Profile;
import pd.example.springmysqldockerimage.service.ProfileService;

import java.util.List;

@Controller
public class ProfileController {
    @Autowired
    public ProfileService profileService;
    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String fillComplain(Profile profile) {
        profileService.save(profile);
        return "redirect:/list";
    }
    @GetMapping("/list")
    public String getAllModels(Model model) {
        List<Profile> profiles= profileService.findAll();
        model.addAttribute("profiles", profiles);
        return "list";
    }
}
