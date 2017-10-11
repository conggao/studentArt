package com.gk.util.defs;

import java.util.ArrayList;
import java.util.List;


public class UserRoleDefs {

	public static final Integer     USER_ROLE_TEACHER                       = 1;
	public static final Integer     USER_ROLE_STUDENT                       = 2;
	public static final Integer     USER_ROLE_PARENT                        = 3;
	
	public static List<Integer>    listUserRole = new ArrayList<Integer>(){{
		add(new Integer(USER_ROLE_TEACHER));
		add(new Integer(USER_ROLE_STUDENT));
		add(new Integer(USER_ROLE_PARENT));
	}};

	public static final Integer     USER_FAMILY_ROLE_DADDY                     = 1;
	public static final Integer     USER_FAMILY_ROLE_MOTHER                    = 2;
	public static final Integer     USER_FAMILY_ROLE_SON                       = 3;
	public static final Integer     USER_FAMILY_ROLE_DAUGHTER                  = 4;
}
