
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();
			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>京东</title>
		<style type="text/css">
			.d1{
				margin-left: 100px;
				margin-top:50px;
			}
			.d1-1{
				margin-left:100px;
				margin-top: -30px;
				position: absolute;
			}
			div1{
				float:left;
			}
			.d2{
				width: 1200px;
				height:400px;
				border: 1px lightgray solid;
				position: absolute;
				left:50%;
				margin-left: -600px;
				margin-top: 20px;
				
			}
			div2{
				width:230px ;
				height:350px;
			/*border-right: 1px lightgray solid;*/
			float: left;
			margin-top: 10px;
			
			}
			.div2-1{
				margin-left: +20px;
				border-right: 1px lightgray solid;
			}
			.div2-2{
				border-right: 1px lightgray solid;
			}
			.div2-3{
				border-right: 1px lightgray solid;
			}
			.div2-4{
				border-right: 1px lightgray solid;
			}
			
			.div2-5{
				border-left: 1px white solid;
			}
			div3{width: 200px;
			height: 30px;
	         color: gray;
				font-size: 12px;
				position: absolute;
				margin-left: +15px
				;
				

			}
			div4{
				width: 100px;
				height:30px;
				color: indianred;
				text-align: center;
				font-size: 20px;
				margin-left: +15px;
				margin-top:+50px;
				position: absolute;
				
			}
			.d3{
				width: 1200px;
				height:400px;
				/*border: 1px lightgray solid;*/
				position: absolute;
				left:50%;
				margin-left: -600px;
				margin-top: 440px;
				}
			.d3-1-1{
				width: 200px;
				height: 400px;
				border: 1px lightgray solid;
			}
			.d3-1-2{
				width: 200px;
				height: 400px;
				border: 1px lightgray solid;
				margin-left: 600px;
			}
			.d3-2-1{
				width: 400px;
				height: 200px;
				border: 1px lightgray solid;
				margin-left: 200px;
			}
			.d3-2-2{
				width: 400px;
				height: 200px;
				border: 1px lightgray solid;
				margin-left: 200px;
				margin-top:200px;
				
			}
			.d3-2-3{
				width: 400px;
				height: 200px;
				border: 1px lightgray solid;
				margin-left: 800px;
			}
			.d3-2-4{
				width: 400px;
				height: 200px;
				border: 1px lightgray solid;
				margin-left: 800px;
				margin-top:200px;
			}
			div5{
				position: absolute;
			}
			.d4{
				width:1200px;
				height: 110px;
				/*border: 1px lightgray solid;*/
				position: absolute;
				margin-left: -600px;
				margin-top: 860px;
				left:50%
			}
			.d5{
				width:1200px;
				height: 360px;
				/*border: 1px lightgray solid;*/
				position: absolute;
				margin-left: -600px;
				margin-top: 1050px;
				left:50%
			}
			div6{
				width:115px;
				height:72px;
				border: 1px lightgray solid;
				position: absolute;
			}
			.d5-1-2{
				margin-left: 115px;
			}
			.d5-1-4{
				margin-left: 115px;
				margin-top: 72px;
			}
			.d5-1-6{
				margin-left: 115px;
				margin-top: 144px;
			}
			.d5-1-8{
				margin-left: 115px;
				margin-top: 216px;
			}
			.d5-1-10{
				margin-left: 115px;
				margin-top: 288px;
			}
			.d5-1-3{
				margin-top: 72px;
			}
			.d5-1-5{
				margin-top: 144px;
			}
			.d5-1-7{
				margin-top: 216px;
			}
			.d5-1-9{
				margin-top: 288px;
			}
			.d5-2{
				width:345px;
				height: 360px;
				margin-left:230px ;
				position: absolute;
				border: 1px lightgray solid;
			}
			.d5-3-1{
				width:375px;
				height: 165px;
				margin-left:575px ;
				position: absolute;
				border: 1px lightgray solid;
			}
			.d5-3-2{
				width:375px;
				height: 165px;
				margin-left:575px ;
				margin-top: 165px;
				position: absolute;
				border: 1px lightgray solid;
			}
			.d5-3-3{
				width:375px;
				height: 30px;
				margin-left:575px ;
				margin-top: 330px;
				position: absolute;
				border: 1px lightgray solid;
				color: white;
				background-color: dimgray;
				text-align: center;
				line-height: 30px;
			}
			.d5-4{
				width:234px;
				height:360px;
				margin-left:965px ;
				position: absolute;
				/*border: 1px lightgray solid;*/11
			}
			.d7{
				width:1200px;
				height: 57px;
				border: 1px lightgray solid;
				position: absolute;
				margin-left: -600px;
				margin-top: 1450px;
				left:50%
			}
			div7{
				width:118px;
				height:36px ;
				float: left;
				margin-top: 10px;
			}
			.div7-2{
				border-left: lightgray 1px solid;
			}
			.div7-3{
				border-left: lightgray 1px solid;
			}
			.div7-4{
				border-left: lightgray 1px solid;
			}
			.div7-5{
				border-left: lightgray 1px solid;
			}
			.div7-6{
				border-left: lightgray 1px solid;
			}
			.div7-7{
				border-left: lightgray 1px solid;
			}
			.div7-8{
				border-left: lightgray 1px solid;
					border-right: lightgray 1px solid;
			}
			.div7-1{
				width: 176px;
			}
			.div7-9{
				width: 176px;
			}
			.d1-2{
			    margin-left: 1000px;
				margin-top:-20px;
				color:red;
				font-weight:bold;
			}
			img{
			    border:0;
			}
		    .search-2014{
		        margin-left:600px;
		        margin-top:-50px;
		    }
		    .text{
		    width:200px;
		    height:25px;
		    border:2px blue solid;
		    }
		    .button cw-icon{
		    width:50px;
		    height:25px;
		    }
		    .ibg{
		    position:absolute;
		    left:380px;
		    top:70px;
		    }
	.g1{
		    border:1px #DDDDDD solid;
		    position:absolute;
		    left:1400px;
		    top:125px;
		    font-family:微软雅黑;
		    color:red;
		    padding:5px;
		    }
		     a{
    text-decoration: none;
    color:red;
}
		</style>
	</head>
	<body>
	    <a href="zhuye.jsp"><img src="img/jingdong.png"></a>
	    <div style="display:inline;color:gray;font-size:25px;font-family:微软雅黑;margin-left:100px">手机</div>
	    <div class="ibg">
					<select name="ddlCountry" id="ddlCountry" style="width: 80px;">
						<option value="中国" selected>全部分类</option>
						<option value="家用电器">家用电器</option>
						<option value="手机">手机</option>
						<option value="女鞋">女鞋</option>
						<option value="女装">女装</option>
					</select>
				</div>
        <form name="form1" action="queryAllServlet" method=post>
	    <div class="search-2014">
        <ul id="shelper" class="hide"></ul>
       
        <div>
            <input type="text" class="text" name="tableName">
            <input type="submit" name="b" value="搜索">
        </div>
        </div>
	    </form>
	    
		<div class="d1">
		<span style="font-size: 20px;color: dimgrey;font-family: 宋体;font-weight: 800;">今日热门</span>
		</div>
		<div1 class="d1-1">
			<div1 style="margin-left: 10px;margin-left: +100px;"><img src="img/特价1.png"/></div1>
			<div1 style="margin-left: 10px;"><img src="img/热销.png"/></div1>
			<div1 style="margin-left: 10px;"><img src="img/新品.png"/></div1>
			<div1 style="margin-left: 10px;"><img src="img/好评.png"/></div1>
		</div1>
		<div1 class="d1-2">
		    <span>您好，请登录！</span>
		    <a href=login.jsp>登录</a>
		</div1>
		<div class="g1">
		<div style="line-height:40px;float:left;"><a href="lookCosmetic.jsp">我的购物车</a></div>
		<div style="float:left"><img src="img/bt1.png"></div>
		</div>
		<div class="d2">
			<div2 class="div2-1">
				<div style="margin-left: +15px;margin-top: +10px;"><a href="https://item.jd.com/7119998.html"><img src="img/手机1.1.png"width="190px"height="230px"/></a></div>
			<div3>小米6X 移动定制全网通版 6GB+128GB 亮黑色 移动联通电信4G手机 双卡双</div3>
			<div4>¥2999.00</div4>
			</div2>
			<div2 class="div2-2">
				<div style="margin-left: +15px;margin-top: +10px;"><a href="https://item.jd.com/11347274100.html"><img src="img/手机1.2.png"width="190px"height="230px"/></a></div>
			<div3>华为 HUAWEI nova 4GB+64GB版 香槟金（白）移动联通电信4G手机 双卡</div3>
			<div4>¥1599.00</div4>
			</div2>
			<div2 class="div2-3">
				<div style="margin-left: +15px;margin-top: +10px;"><a href="https://item.jd.com/4086229.html"><img src="img/手机1.3.png"width="190px"height="230px"/></a></div>
				<div3>锤子 坚果Pro 128GB 细红线特别版 全网通 移动联通电信4G手机 双卡双待</div3>
				<div4>¥2299.00</div4>
			</div2>
			<div2 class="div2-4">
				<div style="margin-left: +15px;margin-top: +10px;"><a href="https://item.jd.com/27309370764.html"><img src="img/手机1.4.png"width="190px"height="230px"/></a></div>
				<div3>三星 Galaxy S7 edge（G9350）32GB 铂光金全网通4G手机 双卡双待 </div3>
				<div4>¥3688.00</div4>
				
			</div2>
			<div2 class="div2-5">
				<div style="margin-left: +15px;margin-top: +10px;"><a href="https://item.jd.com/31141126880.html"><img src="img/手机1.5.png"width="190px"height="230px"/></a></div>
				<div3>金立F109 暗夜黑 3GB+16GB版 移动联通电信4G手机 双卡双待 </div3>
				<div4>¥1099.00</div4>
		     </div2>
			
		</div>
		<div class="d1">
		<span style="font-size: 20px;color: dimgrey;font-family: 宋体;font-weight: 800;position: absolute;margin-top: 400px;">主题购</span>
		</div>
		<div class="d3">
			<div5 class="d3-1-1">
				<img src="img/新phone.png"width="200px"height="400px"/>
			</div5>
			
			<div5 class="d3-2-1"><img src="img/精选.png"width="400px"height="200px"/></div5>
			<div5 class="d3-2-2"><img src="img/精选.png"width="400px"height="200px"/></div5>
			<div5 class="d3-1-2"><img src="img/新phone.png"width="200px"height="400px"/></div5>
			<div5 class="d3-2-3"><img src="img/精选.png"width="400px"height="200px"/></div5>
			<div5 class="d3-2-4"><img src="img/精选.png"width="400px"height="200px"/></div5>
		</div>
		<div class="d4">
			<img src="img/图1.png"/width="1200px"height="110px">
		</div>
		</div>
		<div class="d1">
		<span style="font-size: 20px;color: dimgrey;font-family: 宋体;font-weight: 800;position: absolute;margin-top: 1000px;">品牌旗舰店</span>
		<span style="font-size: 20px;color: dimgrey;font-family: 宋体;font-weight: 800;position: absolute;margin-top: 1000px;margin-left: 1000px;">今日大牌推荐</span>
		</div>
		<div class="d5">
			<div6 class="d5-1-1">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-2">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-3">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-4">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-5">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-6">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-7">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-8">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-9">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div6 class="d5-1-10">
				<img src="img/手机5.1.png"width="115px"height="72px"/>
			</div6>
			<div class="d5-2">
				<img src="img/2-2.png"width="345px"height="360px"/>
				
			</div>
			<div class="d5-3-1">
				<img src="img/2-1.png"width="375px"height="165px"/>
			</div>
			<div class="d5-3-2">
				<img src="img/2-1.png"width="375px"height="165px"/>
			</div>
			<div class="d5-3-3">美图官方旗舰店></div>
			<div class="d5-4">
					<img src="img/1-6.png"width="234px"height="360px"/>
			</div>
		</div>
		<div class="d7">
			<div7 class="div7-1"><img src="img/7-1.png"/width="180px"height="40px"></div7>
			<div7 class="div7-2"><img src="img/7-2.png"/width="118px"height="40px"></div7>
			<div7 class="div7-3"><img src="img/7-2.png"/width="118px"height="40px"></div7>
			<div7 class="div7-4"><img src="img/7-2.png"/width="118px"height="40px"></div7>
			<div7 class="div7-5"><img src="img/7-2.png"/width="118px"height="40px"></div7>
			<div7 class="div7-6"><img src="img/7-2.png"/width="118px"height="40px"></div7>
			<div7 class="div7-7"><img src="img/7-2.png"/width="118px"height="40px"></div7>
			<div7 class="div7-8"><img src="img/7-2.png"/width="118px"height="40px"></div7>
			<div7 class="div7-9"><img src="img/7-3.png"/width="180px"height="40px"></div7>
		</div>
		
	</body>
</html>

