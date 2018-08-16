package com.example.lesson6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

  @GetMapping("/movieform")
  public String loadSongForm(Model model){
    model.addAttribute("movie", new Movie());
    return "movieform";
  }

  @PostMapping("/processMovie")
  public String processSongForm(@ModelAttribute Movie movie, Model model){
    model.addAttribute("song", movie);
    return "confirmmovie";
  }

}
