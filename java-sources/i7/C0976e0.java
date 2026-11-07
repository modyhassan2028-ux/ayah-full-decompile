package i7;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: i7.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0976e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0985h0 f17338e;

    public C0976e0(C0985h0 c0985h0, String str, boolean z10) {
        this.f17338e = c0985h0;
        U6.y.c(str);
        this.f17334a = str;
        this.f17335b = z10;
    }

    public final boolean a() {
        if (!this.f17336c) {
            this.f17336c = true;
            this.f17337d = this.f17338e.s().getBoolean(this.f17334a, this.f17335b);
        }
        return this.f17337d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f17338e.s().edit();
        editorEdit.putBoolean(this.f17334a, z10);
        editorEdit.apply();
        this.f17337d = z10;
    }
}
