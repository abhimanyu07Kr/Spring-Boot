package in.abhi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import in.abhi.dao.PhoneDao;
import in.abhi.entity.Phone;

@Controller
public class PhoneController {
	
	private PhoneDao phoneDao;

	public PhoneController(PhoneDao phoneDao) {
		this.phoneDao = phoneDao;
	}
	
	@GetMapping("/find")
	@ResponseBody
	public String save()
	{
		return "this is save data";
	}
	
	@GetMapping("/find2")
	public String find2(Model model)
	{
		model.addAttribute("set","good morning");
//		int i=2/0;
		List<Phone> all = phoneDao.findAll();
		model.addAttribute("phone", all);
		return "index";
	}
	
	@GetMapping("/form")
	public String form(Model model)
	{
//		int i=2/0;
		model.addAttribute("phone", new Phone());
		return "index2";
	}
	
	@PostMapping("/form")
	public String form2(Model model,Phone phone)
	{
		phoneDao.save(phone);
		model.addAttribute("msg", "data saved");
		return "index2";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("phoneId")Integer id,Model model)
	{
		phoneDao.delete(id);
		List<Phone> all = phoneDao.findAll();
		model.addAttribute("phone", all);
		return "index";
	}
	

}
