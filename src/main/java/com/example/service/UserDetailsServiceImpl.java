//package com.example.service;
//
//import java.security.Security;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.domain.LoginUser;
//import com.example.domain.User;
//import com.example.repository.UserRepository;
//
///**
// * ログイン後の管理者情報に権限情報を付与するサービスクラス.
// * 
// * @author igamasayuki
// *
// */
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//	/** DBから情報を得るためのリポジトリ */
//	@Autowired
//	private UserRepository userRepository;
//
//	/*
//	 * (non-Javadoc)
//	 * 
//	 * @see org.springframework.security.core.userdetails.UserDetailsService#
//	 * loadUserByUsername(java.lang.String) DBから検索をし、ログイン情報を構成して返す。
//	 */
//	@Override
//	public UserDetails loadUserByUsername(String email)
//			throws UsernameNotFoundException {
//		System.out.println(email);
//		List<User> userList = userRepository.findByEmail(email);
//		User user = userList.get(0);
//		if (user == null) {
//			throw new UsernameNotFoundException("そのEmailは登録されていません。");
//		}
//		System.out.println(user);
//		// 権限付与の例
//		Collection<GrantedAuthority> authorityList = new ArrayList<>();
//		authorityList.add(new SimpleGrantedAuthority("ROLE_USER")); // ユーザ権限付与
//		return new LoginUser(user,authorityList);
//	}
//}
