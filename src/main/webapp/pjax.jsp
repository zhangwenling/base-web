<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/bootstrap-3.3.4/docs/favicon.ico/favicon.ico">

    <title>Justified Nav Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/bootstrap-3.3.4/docs/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/bootstrap-3.3.4/docs/examples/justified-nav/justified-nav.css" rel="stylesheet">
    
    <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="/bootstrap-3.3.4/docs/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <script type="text/javascript">
    function funcRef(){
    	var hash = window.location.hash;
    	hash = hash.replace('#/', '');
    	$('.active').removeClass('active');
    	$('#' + hash).parent().addClass('active');
		$('#show-title').html(hash);
		alert(2);
    };
    
    window.onhashchange = funcRef;
    
    $(function(){
    	
    	funcRef();
    	
    	$('#nav-justified-id a').bind('click',function(d){
    		var html = d.toElement.innerHTML;
    		window.location.hash = '/' + html;
    	});
    });
    </script>
    
  </head>

  <body>

    <div class="container">

      <div class="masthead">
        <h3 class="text-muted">Project name</h3>
        <nav>
          <ul class="nav nav-justified" id="nav-justified-id">
            <li class="active"><a href="javascript:void(0);" id="Home">Home</a></li>
            <li><a href="javascript:void(0);" id="Projects">Projects</a></li>
            <li><a href="javascript:void(0);" id="Services">Services</a></li>
            <li><a href="javascript:void(0);" id="Downloads">Downloads</a></li>
            <li><a href="javascript:void(0);" id="About">About</a></li>
            <li><a href="javascript:void(0);" id="Contact">Contact</a></li>
          </ul>
        </nav>
      </div>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1 id="show-title">Marketing stuff!</h1>
        <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
        <p><a class="btn btn-lg btn-success" href="#" role="button">Get started today</a></p>
      </div>


      <!-- Site footer -->
      <footer class="footer">
        <p>&copy; Company 2014</p>
      </footer>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="/bootstrap-3.3.4/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
