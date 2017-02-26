<%@ include file ="/WEB-INF/view/template/header.jsp" %>

<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1>Administrator Page</h1>
				<p class="load">This is administrator page</p>
			</div>
			
			<h3>
				<a href="<c:url value="/admin/productInventory"/>">Product Inventory</a>
			</h3>
			
			<p>You can view, check and modify the product inventory!</p>
			
<%@ include file ="/WEB-INF/view/template/footer.jsp" %>