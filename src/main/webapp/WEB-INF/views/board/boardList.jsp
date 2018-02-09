<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title>

<script>
	var page = 1;
	$(document).ready(function() {
		pagingData(page);
	});

	function pagingData(nowPage) {
		$.ajax({
			url : "./boardListInfo/" + nowPage,
			dataType : "json",
			type : 'get',
			success : function(data) {
				$('#table').children().remove();
				for(i in data){
					$('#table').append(markUp(data[i]));
				}
			}
		});
	}

	function previous() {
		if (page > 1) {
			page--;
			pagingData(page);
		}
	}
	function next() {
		page++;
		pagingData(page);
	}

	function markUp(data, i) {
		var trTag = "<tr><td>"+data.boardSeq + "</td><td>" + data.sellerId + "</td><td>" + data.title + "</td></tr>";
		return trTag;
	}
</script>
</head>
<body>


	<div>
		<table id="table" class=".table">
		
		</table>
	</div>

	<button onclick="previous()">이전</button>
	<button onclick="next()">다음</button>


</body>
</html>