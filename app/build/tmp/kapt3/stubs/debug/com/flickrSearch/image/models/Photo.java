package com.flickrSearch.image.models;

import java.lang.System;

@androidx.room.Entity(tableName = "photo")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0013J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010?\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\bH\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\bH\u00c6\u0003J\t\u0010F\u001a\u00020\bH\u00c6\u0003J\t\u0010G\u001a\u00020\bH\u00c6\u0003J\u00aa\u0001\u0010H\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010M\u001a\u00020\bH\u00d6\u0001J\t\u0010N\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0019\"\u0004\b(\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#\u00a8\u0006O"}, d2 = {"Lcom/flickrSearch/image/models/Photo;", "", "id", "", "owner", "secret", "server", "farm", "", "title", "ispublic", "isfriend", "isfamily", "datetaken", "datetakengranularity", "datetakenunknown", "urlH", "heightH", "widthH", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDatetaken", "()Ljava/lang/String;", "setDatetaken", "(Ljava/lang/String;)V", "getDatetakengranularity", "()I", "setDatetakengranularity", "(I)V", "getDatetakenunknown", "setDatetakenunknown", "getFarm", "setFarm", "getHeightH", "()Ljava/lang/Integer;", "setHeightH", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "setId", "getIsfamily", "setIsfamily", "getIsfriend", "setIsfriend", "getIspublic", "setIspublic", "getOwner", "setOwner", "getSecret", "setSecret", "getServer", "setServer", "getTitle", "setTitle", "getUrlH", "setUrlH", "getWidthH", "setWidthH", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/flickrSearch/image/models/Photo;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public final class Photo {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String owner;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String secret;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String server;
    private int farm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private int ispublic;
    private int isfriend;
    private int isfamily;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String datetaken;
    private int datetakengranularity;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String datetakenunknown;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String urlH;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer heightH;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer widthH;
    
    @org.jetbrains.annotations.NotNull()
    public final com.flickrSearch.image.models.Photo copy(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "owner")
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "secret")
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "server")
    java.lang.String server, @com.fasterxml.jackson.annotation.JsonProperty(value = "farm")
    int farm, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "title")
    java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "ispublic")
    int ispublic, @com.fasterxml.jackson.annotation.JsonProperty(value = "isfriend")
    int isfriend, @com.fasterxml.jackson.annotation.JsonProperty(value = "isfamily")
    int isfamily, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "datetaken")
    java.lang.String datetaken, @com.fasterxml.jackson.annotation.JsonProperty(value = "datetakengranularity")
    int datetakengranularity, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "datetakenunknown")
    java.lang.String datetakenunknown, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "url_h")
    java.lang.String urlH, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "height_h")
    java.lang.Integer heightH, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "width_h")
    java.lang.Integer widthH) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Photo(@org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "owner")
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "secret")
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "server")
    java.lang.String server, @com.fasterxml.jackson.annotation.JsonProperty(value = "farm")
    int farm, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "title")
    java.lang.String title, @com.fasterxml.jackson.annotation.JsonProperty(value = "ispublic")
    int ispublic, @com.fasterxml.jackson.annotation.JsonProperty(value = "isfriend")
    int isfriend, @com.fasterxml.jackson.annotation.JsonProperty(value = "isfamily")
    int isfamily, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "datetaken")
    java.lang.String datetaken, @com.fasterxml.jackson.annotation.JsonProperty(value = "datetakengranularity")
    int datetakengranularity, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "datetakenunknown")
    java.lang.String datetakenunknown, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "url_h")
    java.lang.String urlH, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "height_h")
    java.lang.Integer heightH, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "width_h")
    java.lang.Integer widthH) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOwner() {
        return null;
    }
    
    public final void setOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSecret() {
        return null;
    }
    
    public final void setSecret(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServer() {
        return null;
    }
    
    public final void setServer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getFarm() {
        return 0;
    }
    
    public final void setFarm(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getIspublic() {
        return 0;
    }
    
    public final void setIspublic(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getIsfriend() {
        return 0;
    }
    
    public final void setIsfriend(int p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getIsfamily() {
        return 0;
    }
    
    public final void setIsfamily(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDatetaken() {
        return null;
    }
    
    public final void setDatetaken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getDatetakengranularity() {
        return 0;
    }
    
    public final void setDatetakengranularity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDatetakenunknown() {
        return null;
    }
    
    public final void setDatetakenunknown(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrlH() {
        return null;
    }
    
    public final void setUrlH(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHeightH() {
        return null;
    }
    
    public final void setHeightH(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWidthH() {
        return null;
    }
    
    public final void setWidthH(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}