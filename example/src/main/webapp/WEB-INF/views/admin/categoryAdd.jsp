<!-- 
version: 1.0
author: Nguyen Dinh Tien
date: 2024-05-03
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category Add</title>
</head>
<div class="container-fluid">
<div style="padding-left: 100px;padding-top: 20px;">
	<!-- Page Heading -->
	<h1 class="h3 mb-2 text-gray-800">Category Add</h1>
	<p class="mb-4">
		Add new category, delete category, update category, change the
		information of category. <a target="_blank"
			href="https://datatables.net">official DataTables documentation</a>.
	</p>

</div>

	<form style="padding: 100px; padding-top: 30px;">
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="category_code">Category Code</label>
				 <input type="text" class="form-control" id="category_code" placeholder="Category Code">
			</div>
			<div class="form-group col-md-6">
				<label for="category_name">Category Name</label>
				<input type="text" class="form-control" id="category_name" placeholder="Category Name">
			</div>
		</div>
		<div class="form-row">		
			<div class="form-group col-md-6" style = "padding-top: 38px;">
				<label for="active">Active</label> 
				<select id="active" class="form-control">
					<option selected>Choose...</option>
					<option>...</option>
				</select>
			</div>
			<div class="form-group col-md-6">			
				<textarea class="form-control" id="description" name="description" rows="4" cols="50" placeholder="description">description
				</textarea>
			</div>	
		</div>
		<div class="form-row" style="padding: 20px 0px 20px 0px;">
			<div class="form-group col-md-4">
			  <input class="form-controlx" type="file" id="formFileMultiple" multiple>
			</div>
			<div class="form-group col-md-2">
		  		<!-- add dummy here -->
			</div>
			<div class="form-group col-md-6">
		  		<img src="..." class="img-fluid img-thumbnail" alt="...">
			</div>
		</div>	
		
		<button type="submit" class="btn btn-primary">Save</button>
	</form>
</div>
</html>