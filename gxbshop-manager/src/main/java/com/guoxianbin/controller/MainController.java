package com.guoxianbin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName: MainController 
 * @Description: TODO
 * @author: 段文龙
 * @date: 2020年6月29日 下午7:42:21
 */

@Controller
public class MainController {
	
	@RequestMapping({"/","main","index"})
	public String main() {
		return "main";
	}
	
}
