package uk.co.manifesto.javasessions.movies.services;

public class UserServiceImpl implements UserService {
    
	/**
	 * Write a happy-path test for the class presented below. 
	 *   Verify that the user gets his new password, 
	 *   and that the updateUser() method of userDAO is called.
	 */
	
	
	private UserDAO userDAO;
    private SecurityService securityService;
    
    public UserServiceImpl(UserDAO dao, SecurityService security) {
        this.userDAO = dao;
        this.securityService = security;
    } 
    
    public void assignPassword(User user) throws Exception {
        String passwordMd5 = securityService.md5(user.getPassword());
        user.setPassword(passwordMd5);
        userDAO.updateUser(user);
    }
}