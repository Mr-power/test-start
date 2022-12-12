package com.study.core.util.demo;


import com.study.core.util.demo.right.AbstractCart;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static ApplicationContext applicationContext;

    @GetMapping("wrong")
    public Cart wrong(@RequestParam("userId") int userId) {
        //根据用户ID获得用户类型
        String userCategory = null; //Db.getUserCategory(userId);
        //普通用户处理逻辑
        if (userCategory.equals("Normal")) {
            NormalUserCart normalUserCart = new NormalUserCart();
            return normalUserCart.processWrong(userId, null);
        }
//        //VIP用户处理逻辑
//        if (userCategory.equals("Vip")) {
//            VipUserCart vipUserCart = new VipUserCart();
//            return vipUserCart.process(userId, items);
//        }
//        //内部用户处理逻辑
//        if (userCategory.equals("Internal")) {
//            InternalUserCart internalUserCart = new InternalUserCart();
//            return internalUserCart.process(userId, items);
//        }

        return null;
    }


    @GetMapping("right")
    public Cart right(@RequestParam("userId") int userId) {
        String userCategory = null ;//Db.getUserCategory(userId);
        AbstractCart cart = (AbstractCart) applicationContext.getBean(userCategory + "UserCart");
        return cart.process(userId, null);
    }
}
