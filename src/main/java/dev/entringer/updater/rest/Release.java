package dev.entringer.updater.rest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Release {
    private String url;
    private float id;
    private String node_id;
    private String tag_name;
    private String target_commitish;
    private String name;
    private String body;
    private boolean draft;
    private boolean prerelease;
    private LocalDateTime published_at;
    List<Asset> assets = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public String getTarget_commitish() {
        return target_commitish;
    }

    public void setTarget_commitish(String target_commitish) {
        this.target_commitish = target_commitish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    public boolean isPrerelease() {
        return prerelease;
    }

    public void setPrerelease(boolean prerelease) {
        this.prerelease = prerelease;
    }

    public LocalDateTime getPublished_at() {
        return published_at;
    }

    public void setPublished_at(LocalDateTime published_at) {
        this.published_at = published_at;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}


    /* "url": "https://api.github.com/repos/fabricio-entringer/commons/releases/92917365",
       "assets_url": "https://api.github.com/repos/fabricio-entringer/commons/releases/92917365/assets",
       "upload_url": "https://uploads.github.com/repos/fabricio-entringer/commons/releases/92917365/assets{?name,label}",
       "html_url": "https://github.com/fabricio-entringer/commons/releases/tag/v1.0",
       "id": 92917365,
       "author": {
           "login": "fabricio-entringer",
           "id": 30873948,
           "node_id": "MDQ6VXNlcjMwODczOTQ4",
           "avatar_url": "https://avatars.githubusercontent.com/u/30873948?v=4",
           "gravatar_id": "",
           "url": "https://api.github.com/users/fabricio-entringer",
           "html_url": "https://github.com/fabricio-entringer",
           "followers_url": "https://api.github.com/users/fabricio-entringer/followers",
           "following_url": "https://api.github.com/users/fabricio-entringer/following{/other_user}",
           "gists_url": "https://api.github.com/users/fabricio-entringer/gists{/gist_id}",
           "starred_url": "https://api.github.com/users/fabricio-entringer/starred{/owner}{/repo}",
           "subscriptions_url": "https://api.github.com/users/fabricio-entringer/subscriptions",
           "organizations_url": "https://api.github.com/users/fabricio-entringer/orgs",
           "repos_url": "https://api.github.com/users/fabricio-entringer/repos",
           "events_url": "https://api.github.com/users/fabricio-entringer/events{/privacy}",
           "received_events_url": "https://api.github.com/users/fabricio-entringer/received_events",
           "type": "User",
           "site_admin": false
        },
        "node_id": "RE_kwDOHbX3PM4Fic51",
        "tag_name": "v1.0",
            "target_commitish": "master",
            "name": "v1.0",
            "draft": false,
            "prerelease": false,
            "created_at": "2023-01-20T10:27:23Z",
            "published_at": "2023-02-18T15:19:40Z",
            "assets": [
            {
                "url": "https://api.github.com/repos/fabricio-entringer/commons/releases/assets/96188550",
                "id": 96188550,
                "node_id": "RA_kwDOHbX3PM4Fu7iG",
                "name": "updater-0.0.1-SNAPSHOT.jar",
                "label": null,
                "uploader": {
                    "login": "fabricio-entringer",
                    "id": 30873948,
                    "node_id": "MDQ6VXNlcjMwODczOTQ4",
                    "avatar_url": "https://avatars.githubusercontent.com/u/30873948?v=4",
                    "gravatar_id": "",
                    "url": "https://api.github.com/users/fabricio-entringer",
                    "html_url": "https://github.com/fabricio-entringer",
                    "followers_url": "https://api.github.com/users/fabricio-entringer/followers",
                    "following_url": "https://api.github.com/users/fabricio-entringer/following{/other_user}",
                    "gists_url": "https://api.github.com/users/fabricio-entringer/gists{/gist_id}",
                    "starred_url": "https://api.github.com/users/fabricio-entringer/starred{/owner}{/repo}",
                    "subscriptions_url": "https://api.github.com/users/fabricio-entringer/subscriptions",
                    "organizations_url": "https://api.github.com/users/fabricio-entringer/orgs",
                    "repos_url": "https://api.github.com/users/fabricio-entringer/repos",
                    "events_url": "https://api.github.com/users/fabricio-entringer/events{/privacy}",
                    "received_events_url": "https://api.github.com/users/fabricio-entringer/received_events",
                    "type": "User",
                    "site_admin": false
                },
            "content_type": "application/java-archive",
            "state": "uploaded",
            "size": 14093965,
            "download_count": 0,
            "created_at": "2023-02-18T15:19:30Z",
            "updated_at": "2023-02-18T15:19:35Z",
            "browser_download_url": "https://github.com/fabricio-entringer/commons/releases/download/v1.0/updater-0.0.1-SNAPSHOT.jar"
    }
  ],
          "tarball_url": "https://api.github.com/repos/fabricio-entringer/commons/tarball/v1.0",
          "zipball_url": "https://api.github.com/repos/fabricio-entringer/commons/zipball/v1.0",
          "body": "* New version"

     */
