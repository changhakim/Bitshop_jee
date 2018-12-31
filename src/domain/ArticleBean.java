package domain;

public class ArticleBean {
	private String title,content,writer,regdate,sep;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getSep() {
		return sep;
	}

	public void setSep(String sep) {
		this.sep = sep;
	}

	@Override
	public String toString() {
		return "ArticleBean [title=" + title + ", content=" + content + ", writer=" + writer + ", regdate=" + regdate
				+ ", sep=" + sep + "]";
	}
	
}
