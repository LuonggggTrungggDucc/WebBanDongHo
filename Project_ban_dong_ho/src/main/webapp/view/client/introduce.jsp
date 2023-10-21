<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:url value = "/view/client/assets" var="url"/>
  <!-- Start header section -->
  <jsp:include page = "./header/mainHeader.jsp" flush = "true" />
  
  
  <section id="aa-catg-head-banner">
   <img src="${pageContext.request.contextPath}/view/client/assets/images/banner-product.jpg" alt="banner sản phẩm">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Giới thiệu</h2>
        <ol class="breadcrumb">
          <li><a href="${pageContext.request.contextPath}/">Trang chủ</a></li>      
          <li style="color:#fff">Giới thiệu</li>   
        </ol>
      </div>
     </div>
   </div>
  </section>
  <section id="aa-product-category">
    <div class="container">
      <div class="row">
      	<div>
      		<h1 style ="text-align: center; color: red;">Shop Trung Đức</h1>
      		<p>Chúng tôi hi vọng tất cả người Việt nam sẽ được sử dụng những sản phẩm chất lượng, và an toàn nhất tại cửa hàng cung
      		 cấp sản phẩm mới nhất <strong>Shop Trung Đức</strong>.Với sứ mệnh trở thành một trong những nhà cung cấp sản phẩm hàng đầu tại
      		 Việt Nam đưa đến người dùng loại sản phẩm chất lượng nhất của các trên toàn quốc với mục đích là 
      		<strong>“Sang trọng với bạn”</strong>. Với quy trình lựa chọn và kiểm soát nghiêm ngặt Shop Trung Đức đã tạo nên quỹ đầu tư chuyên thu mua 
      		và cung cấp phân phối những sản phẩm chất lượng nhất từ các nhà phân phối đến tay người dùng giúp họ có những chiếc đồng hồ đẹp
      		nhất trong từng sản phẩm khác biệt từ tạo hóa.</p>
      		<img src="${url}/images/na.jpg" alt="Bannner"/> <br/> <br>
      		<p>Với triết lý trong kinh doanh là tuân thủ và đảm bảo được chất lượng cao, nguồn gốc xuất xứ về sản phẩm rõ ràng.Chúng tôi cam kết sản phẩm
      		chính hãng và cam kết với quý khách hàng về toàn bộ những sản phẩm được phân phối qua hệ thống phân phối  <strong>Shop Trung Đức </strong>
      		đảm bảo an toàn nhất.</p>
      		<p>Với cam kết chỉ phân phối những hàng hóa được cung cấp từ những nhà sản xuất có uy tín và đã được cơ quan có thẩm quyền cấp chứng nhận và
      		đảm bảo sản phẩm có đủ quyền, các loại sản phẩm là những chiếc đồng hồ trên toàn quốc, các sản phẩm sử dụng hàng ngày
      		,...</p>
      		<img src="${url}/images/ann.jpg" alt="Banner" width= "1160" height= "600"/> <br/> <br>
      		<strong>Dưới đây, chúng tôi xin điểm qua những sản phẩm của Shop Trung Đức hiện đang được rất nhiều khách hàng tin dùng và ưa chuộng:</strong><br/>
      		<p> <strong>Đồng hồ Châu Âu, an toàn có nguồn gốc rõ ràng: </strong>
			Pierre Lannier là một thương hiệu đồng hồ và trang sức Pháp <strong>Shop Trung Đức</strong> ra đời từ những năm 1977. Thương hiệu này có nhiều bộ sưu tập  
			đáng chú ý như Automatic, Beaucour, Cityline, Nova và các dòng sản phẩm khác.Hệ thống vận hành của chúng tôi được thực hiện theo dây chuyền đảm bảo rằng 
			các bạn sẽ nhận được sản phẩm chất lượng với thời gian vận chuyển ngắn nhất đáp ứng được độ chính hãng,an toàn.</p>
      		<p> <strong>Đồng Hồ Pierre Lannier 010P958 Nữ Quartz: </strong>
      		Hãy khám phá ngay chiếc đồng hồ nữ Multiples 010P958 với dây đeo milanese vàng hồng sang trọng,<strong>Shop Trung Đức</strong> sáng bóng và đầy năng lượng. Điểm nhấn của chiếc đồng hồ này chính là mặt kính pha lê đặc biệt và mặt số màu.
      		vàng hồng lấp lánh như ánh nắng.
      		</p>
      		<p> <strong>Đồng Hồ Pierre Lannier 023L928 Nữ Quartz: </strong>
      		Đồng hồ nữ Nova 023L928 Milanese bằng thép mạ vàng hồng được trang trí bằng đá pha lê, tạo nên một chiếc đồng hồ vừa nhỏ gọn lại vô cùng quyến rũ nhờ các chi tiết hoàn thiện. Khám phá tất cả những ưu điểm của mẫu đồng hồ này và để mình bị
      		cuốn hút bởi nó!
      		</p>
      		<br />
      	</div>
      </div>
     </div>
    </section>
    
<!--  footer-->
 <jsp:include page = "./footer/footer.jsp" flush = "true" />
<!-- end footer-->
      