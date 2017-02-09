package com.niit.BACKEND.dao;
import java.util.List;

import com.niit.BACKEND.model.ForumCategory;

public interface ForumCategoryDAO {
	
	public List<ForumCategory> getAllForumCategory();
	
	public boolean forumCategoryUpdate(ForumCategory forumcategory);
		
	public ForumCategory getForumCategoryByID(int fcid);

}
