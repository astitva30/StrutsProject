<%@taglib uri="/struts-tags" prefix="a"%>
<%@taglib uri="/struts-dojo-tags" prefix="dojo" %>


<dojo:head debug="true"/>

<h2>USER SIGN IN</h2>

<a:form action="loginaction.action">
    <a:textfield label="id" name="userId"/>
    <a:password label="Password" name="pass"/>
    <a:submit label="Login"/>
</a:form>

<h2>USER SIGN UP</h2>

<a:form action="signupaction.action" enctype="multipart/form-data" validate="true">
    
    <a:textfield label="Id" name ="userId"/>
    <a:password label="Password" name="pass"/>
    <a:textfield label="Full name" name ="fNm"/>
    <a:textfield label="E-mail" name ="mail"/>
    <a:textfield label="Contact" name ="contact"/>
    <a:textfield label="Address" name ="address"/>
    
    <dojo:autocompleter label="City"
                        list="{'indore','itarsi','bhopal','bhilali'}"
                        name="city" autoComplete="false"
                        showDownArrow=""/>
    
    <dojo:datetimepicker label="DOB" name="dOB"/>
    <dojo:datetimepicker label="Time" name="time" type="time"/>
    <a:radio list="{'Female','Male'}" label="Gender" name="gender"/>

<a:checkboxlist list="{'sports','music','reading','programming','travelling'}" label="Hobbies" name="hobbies"/>

<a:file label="Upload photo" name="photo"/> 

<a:submit label="Submit"/>

<a:reset label="Login"/>

</a:form>
    
<h2>CHANGE PASSWORD</h2>

<a:form action="pwchangeaction.action" enctype="multipart/form-data" validate="true">
    <a:textfield label="Id" name ="userId"/>
    <a:password label="Password" name="pass"/>
    <a:password label="Confirm Password" name="cPass"/>
    <a:submit label="Submit"/>
</a:form>