package struts;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements ServletRequestAware {
    private static final long serialVersionUID = 2314658036095404518L;
    private File uploaded;
    private String uploadedContentType;
    private String uploadedFileName;
    private HttpServletRequest httpServletRequest;

    public File getUploaded() {
        return uploaded;
    }

    public void setUploaded(File uploaded) {
        this.uploaded = uploaded;
    }

    public String getUploadedContentType() {
        return uploadedContentType;
    }

    public void setUploadedContentType(String uploadedContentType) {
        this.uploadedContentType = uploadedContentType;
    }

    public String getUploadedFileName() {
        return uploadedFileName;
    }

    public void setUploadedFileName(String uploadedFileName) {
        this.uploadedFileName = uploadedFileName;
    }

    public String execute() {
        try {
            // Get the servers upload directory real path name
            String filePath = httpServletRequest.getSession().getServletContext().getRealPath("/") + "upload";

            // create the upload folder if not exists
            File folder = new File(filePath);
            if (!folder.exists()) {
                folder.mkdir();
            }

            System.out.println("Server path:" + filePath);
            File fileToCreate = new File(filePath, this.uploadedFileName);

            FileUtils.copyFile(this.uploaded, fileToCreate);
        } catch (Exception e) {
            e.printStackTrace();
            addActionError(e.getMessage());
            return INPUT;
        }
        return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }
}
