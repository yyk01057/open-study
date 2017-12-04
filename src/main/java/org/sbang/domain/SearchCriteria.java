package org.sbang.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCriteria extends Criteria {

	private String searchType;
	private String keyword;

	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + ", getPage()=" + getPage() + ", getPageStart()=" + getPageStart() + ", getPerPageNum()=" + getPerPageNum() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}