<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<title>COLLABORATION</title>

<link rel="shortcut icon" href="assets/images/gt_favicon.png">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="resources/css/font-awesome.min.css">

<!-- Custom styles for our template -->
<link rel="stylesheet" href="resources/assets/css/main.css">

<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/angular.min.js"></script>
<script src="resources/js/angular-route.min.js"></script>
<script src="resources/js/angular-cookies.min.js"></script>
</head>
<body ng-app="myApp" class="container" ng-controller="UserProfileController as ctrl"  background="resources/assets/images/01.jpg">

	<div ng-show="currentUser.useremail==undefined">
		<div ng-include="'k_common/common.html'"></div>
	</div>
	<div ng-show="currentUser.useremail!==undefined">
		<div ng-show="currentUser.currentrole=='Role_Student'">
			<div ng-include="'k_common/userview.html'"></div>
		</div>
	</div>	
	<div ng-show="currentUser.useremail!==undefined">
		<div ng-show="currentUser.currentrole=='Role_Admin'">
			<div ng-include="'k_common/adminview.html'"></div>
		</div>
	</div>
	<div ng-show="currentUser.useremail!==undefined">
		<div ng-show="currentUser.currentrole=='Role_Alumin'">
			<div ng-include="'k_common/userview.html'"></div>
		</div>
	</div>	
	
	<div class="jumbotran">
		<div class="container">
			<div ng-view></div>
		</div>
	</div>

	<br/><br/>
	

	
   







	<script src="resources/assets/js/headroom.min.js"></script>
	<script src="resources/assets/js/jQuery.headroom.min.js"></script>
	<script src="resources/assets/js/template.js"></script>

	<script src="app.js"></script>
	<script src="k_home/HomeController.js"></script>
	<script src="k_user/UserProfileController.js"></script>
	<script src="k_user/UserProfileService.js"></script>
	<script src="k_blog/BlogController.js"></script>
	<script src="k_blog/BlogService.js"></script>
	<script src="k_forum/ForumController.js"></script>
	<script src="k_forum/ForumService.js"></script>
	<script src="k_friend/FriendController.js"></script>
	<script src="k_friend/FriendService.js"></script>
	<script src="k_job/JobController.js"></script>
	<script src="k_job/JobService.js"></script>

	<script src="k_chat/ChatController.js"></script>
	<script src="k_chat/ChatService.js"></script>
	<script src="k_chat/sockjs.min.js"></script>
	<script src="k_chat/stomp.min.js"></script>
	<script src="k_chat/lodash.min.js"></script>
	
	
	
	
</body>
</html>