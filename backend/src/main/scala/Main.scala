object MinimalApplication extends cask.MainRoutes{
  @cask.get("/upload")
  def clean_data(data: cask.Request) ={

  }

  @cask.post("/download")
  def create_zip_file() ={

  }

  initialize()
}