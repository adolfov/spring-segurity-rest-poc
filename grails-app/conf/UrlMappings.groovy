class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		"/citas"(controller: "event")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
