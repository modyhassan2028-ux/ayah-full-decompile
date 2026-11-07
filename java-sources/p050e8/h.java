package p050e8;

import L5.c;
import U6.y;
import Y6.d;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15861f;
    public final String g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = d.f10447a;
        y.h("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f15857b = str;
        this.f15856a = str2;
        this.f15858c = str3;
        this.f15859d = str4;
        this.f15860e = str5;
        this.f15861f = str6;
        this.g = str7;
    }

    public static h a(Context context) {
        c cVar = new c(context);
        String strE = cVar.E("google_app_id");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return new h(strE, cVar.E("google_api_key"), cVar.E("firebase_database_url"), cVar.E("ga_trackingId"), cVar.E("gcm_defaultSenderId"), cVar.E("google_storage_bucket"), cVar.E("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return y.i(this.f15857b, hVar.f15857b) && y.i(this.f15856a, hVar.f15856a) && y.i(this.f15858c, hVar.f15858c) && y.i(this.f15859d, hVar.f15859d) && y.i(this.f15860e, hVar.f15860e) && y.i(this.f15861f, hVar.f15861f) && y.i(this.g, hVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15857b, this.f15856a, this.f15858c, this.f15859d, this.f15860e, this.f15861f, this.g});
    }

    public final String toString() {
        c cVar = new c(this);
        cVar.k(this.f15857b, "applicationId");
        cVar.k(this.f15856a, "apiKey");
        cVar.k(this.f15858c, "databaseUrl");
        cVar.k(this.f15860e, "gcmSenderId");
        cVar.k(this.f15861f, "storageBucket");
        cVar.k(this.g, "projectId");
        return cVar.toString();
    }
}
