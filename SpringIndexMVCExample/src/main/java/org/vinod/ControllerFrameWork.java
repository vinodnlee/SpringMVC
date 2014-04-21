package org.vinod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Ragavi
 * Date: 4/21/14
 * Time: 10:07 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class ControllerFrameWork {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
