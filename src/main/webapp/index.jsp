<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="taskManagerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AngularJS Task Manager</title>
<link href='./css/style.css' rel="stylesheet" type="text/css"></link>
<link href='./css/css/font-awesome.css' rel="stylesheet" type="text/css"></link>
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<script data-require="angular.js@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular.js"></script>
  <script data-require="angular-animate@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular-animate.js"></script>
<script type="text/javascript" src="./js/app.js"></script>
</head>
<body>

<div ng-controller="taskManagerController">
<h2 class="page-title">Demo for project resource management using spring boot &amp; AngularJS</h2>
<a href="" class="button-red" style="text-align:center;width:70px;margin-left:45%;margin-right:40%">Demo</a>	
	<div id="task-panel" class="fadein fadeout showpanel panel"  ng-show="toggle">	
		<div class="panel-heading">
			<i class="panel-title-icon fa fa-tasks"></i>
			<span class="panel-title">Recent Categories</span>
			<div class="panel-heading-controls">
				<button ng-click="toggle = !toggle" class="btn-panel">Add New Categories</button>
			</div>
		</div>
		<div class="panel-body">
			<div class="task" ng-repeat="task in tasks">
				<div >				
					<a href="#" class="uncheckedClass">
						{{task.nameCategorie}}
					<span class="action-status">{{task.reference}}</span>
					</a>
				</div>
			</div>
		</div>
	</div>
	
	
	<div id="add-task-panel" class="fadein fadeout addpanel panel" ng-hide="toggle">
		<div class="panel-heading">
			<i class="panel-title-icon fa fa-plus"></i>
			<span class="panel-title">Add category</span>
			<div class="panel-heading-controls">
				<button ng-click="toggle = !toggle" class="btn-panel">Show All Categories</button>
			</div>
		</div>
		<div class="panel-body">
			<div class="task" >
				<table class="add-task">
					<tr>
						<td>Category Reference:</td>
						<td><input type="text" ng-model="categoryName"/></td>
					</tr>
					<tr>
						<td>Category Name:</td>
						<td><input type="text" ng-model="categoryReference"/></td>
					</tr>
					<tr>
						<td><br/><button ng-click="addTask()" class="btn-panel-big">Add New Category</button></td>
					</tr>
				</table>								
			</div>
		</div>
	</div>
</div>
</body>
</html>