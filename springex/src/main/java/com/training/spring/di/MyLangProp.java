package com.training.spring.di;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.lang.prop")
public class MyLangProp {

    private String              hello;
    private String              lang;
    private int                 index;
    private List<String>        liste;
    private Map<String, String> langMap;

    public String getHello() {
        return this.hello;
    }

    public void setHello(final String helloParam) {
        this.hello = helloParam;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(final String langParam) {
        this.lang = langParam;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(final int indexParam) {
        this.index = indexParam;
    }

    public List<String> getListe() {
        return this.liste;
    }

    public void setListe(final List<String> listeParam) {
        this.liste = listeParam;
    }

    public Map<String, String> getLangMap() {
        return this.langMap;
    }

    public void setLangMap(final Map<String, String> langMapParam) {
        this.langMap = langMapParam;
    }

    @Override
    public String toString() {
        return "MyLangProp [hello="
               + this.hello
               + ", lang="
               + this.lang
               + ", index="
               + this.index
               + ", liste="
               + this.liste
               + ", langMap="
               + this.langMap
               + "]";
    }


}
