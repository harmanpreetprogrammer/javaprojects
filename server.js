var express=require("express"); //using express for creating API/ web service
var fileuploader=require("express-fileupload");


var path=require("path");


var app=express();

app.listen(2001,function(){
    console.log("server started....");
});

app.use(express.static("public")); //express.static("public") :- is a middleware


app.get("/signup",function(req,resp) //URL Handler
{
    //resp.contentType("text/html");
    //console.log("User want to Signup...");
    //resp.write("<center><b>U want to signup??? Pakkaaaa?</b></center>");
    //resp.end();
    resp.sendFile(__dirname+"/public/signup.html");
})

app.get("/login",function(req,resp){
    resp.contentType("text/html");
    resp.write("Welcome to Login Screen<br>");
    resp.write("Welcome to Login Screen<br>");
    resp.write("Welcome to Login Screen<br>");
    resp.write("Welcome to Login Screen<br>");
    resp.write("Welcome to Login Screen<br>");
    resp.end();
})

app.get("/forgot",function(req,resp){
    resp.send("<h2>Fir Bhoool gaye....</h2>");
})

app.get("/",function(req,resp){
    var dir= process.cwd(); //process is a global object, cwd: current working dir
   
    console.log(dir);
    var dir2=__dirname;//gloabal variable
    var file= __filename;
    console.log(dir2+"      "+file );

    //var path= process.cwd()+"/public/index.html";

    var pathFile=path.join(__dirname,"public","index.html");
    resp.sendFile(path);

})

app.get("/signup-process",function(req,resp){
        //resp.send(req.query);
        console.log(req.query);
    /*var email=req.query.txtEmail;
    var pwd=req.query.txtPwd;
    var mob=req.query.txtMob;

    resp.send("Welcome:"+email+ "<br> Ur Password="+pwd+"<br> Ur Mobile Number="+mob);
    */
   
    var techs="";
    if(req.query.chkJava!=null)
        techs+=req.query.chkJava+",";
    
    if(req.query.chkWeb!=null)
        techs+=req.query.chkWeb;
    
        if(techs=="")
            techs="Nalayak Hai";
        resp.send(req.query+"<br>Tech.="+techs);

})
//---------------------------------------------------------
app.use(express.urlencoded(true)); //creats JSON object of Binary data
app.use(fileuploader());

app.post("/signup-process-post",function(req,resp)
        {
        console.log(req.body);;
        console.log(req.body);
        var email=req.body.txtEmail;
        var pwd=req.body.txtPwd;
        var mob=req.body.txtMob;

        var data="Welcome:"+email+ "<br> Ur Password="+pwd+"<br> Ur Mobile Number="+mob;
        
        var techs="";
        if(req.body.chkJava!=null)
            techs+=req.body.chkJava+",";
        
        if(req.body.chkWeb!=null)
            techs+=req.body.chkWeb;
        
        if(techs=="")
            techs="Nalayak Hai";

            var jsonStr= JSON.stringify(req.body);
            
            //-------------Uploading File-----------------
            var selFileName= req.files.profilePic.name;
            var desPath=path.join(__dirname,"public/uploads",selFileName);

            req.files.profilePic.mv(desPath,function(){
                console.log("File Saved in Uploads Successfully");
            })


            var state=req.body.comboState;
            var cit=req.body.cities.toString();//convert array to comma concatinated string


            resp.send(data+","+jsonStr+"<br>Tech.="+techs+"<br>Sel State="+state+"<br> Cities="+cit);
      })