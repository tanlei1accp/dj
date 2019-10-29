package com.example.csdj.committee.realm;

import com.example.csdj.branch.entity.Member;
import com.example.csdj.branch.service.DzMemberService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    DzMemberService dzMemberService;
    /**
     * 授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        return null;
    }

    /**
     * 认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     * if(select==1){
     *             System.out.println(member+"党支部传值");
     *             Member a=dzMemberService.selectUserByNameAndPwd(member);
     *             System.out.println("党支部登陆"+a);
     *             if (a != null) {
     *             session.setAttribute("member",a);
     * //                model.put("member",a);
     *                 return "/branch/index";
     *             }else {
     *                 model.put("msg","登录失败");
     *                 System.out.println("登陆失败");
     *                 return "redirect:login";
     *             }
     *         }
     *         if(select==2){
     *             Member b=dzMemberService.selectUserByNameAndPwdforJg(member);
     *             System.out.println("机关党委登陆"+b);
     *             if (b != null) {
     *                 session.setAttribute("member",b);
     * //                model.put("member",b);
     *                 return "/committee/index";
     *             }else {
     *                 System.out.println("登陆失败");
     *                 model.put("msg","登录失败");
     *                 return "redirect:login";
     *             }
     *         }
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        System.out.println("select"+token.getHost());
        Member a=dzMemberService.selectUserByNameAndPwd(token.getUsername(),token.getHost());
        //验证用户名
        if(a==null || !token.getUsername().equals(a.getMemName())) {
            //返回空则内部会报UnknownAccountException异常
            System.out.println("用户名有错");
            return null;
        }
        //判断密码
        /*
        参数1：在shiro当中保存的一个值，在这里保存的是user对象。此后在认证的时候会用到。
        参数2：代表密码
        参数3：代表realm的名字
         */
        System.out.println("验证");
        return new SimpleAuthenticationInfo(a,a.getMemPwd(),"");
    }
}
