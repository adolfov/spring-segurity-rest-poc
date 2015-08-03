import admin.Authority
import admin.User
import admin.UserAuthority

class BootStrap {

	def init = { servletContext ->

		def user =new User(username:"test", password:"test123")
		user.save()

		def roleUser=new Authority(authority:"ROLE_USER")
		roleUser.save()

		new UserAuthority(user:user, authority:roleUser).save()
	}
	def destroy = {
	}
}
