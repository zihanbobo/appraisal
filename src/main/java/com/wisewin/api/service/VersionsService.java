package com.wisewin.api.service;

import com.wisewin.api.dao.VersionsDAO;
import com.wisewin.api.entity.bo.VersionsBO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("VersionsService")
@Transactional
public class VersionsService {

    @Resource
    private VersionsDAO versionsDAO;

    /**
     * 查询版本
     */
    public VersionsBO queryVersions(Integer versioncode, String platform){
        return  versionsDAO.queryVersions(versioncode,platform);
    }

}
