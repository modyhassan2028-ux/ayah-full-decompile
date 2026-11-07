package i7;

import android.content.SharedPreferences;
import j$.util.Objects;

/* JADX INFO: renamed from: i7.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0985h0 f17349e;

    public C0979f0(C0985h0 c0985h0, String str, long j) {
        Objects.requireNonNull(c0985h0);
        this.f17349e = c0985h0;
        U6.y.c(str);
        this.f17345a = str;
        this.f17346b = j;
    }

    public final long a() {
        if (!this.f17347c) {
            this.f17347c = true;
            this.f17348d = this.f17349e.s().getLong(this.f17345a, this.f17346b);
        }
        return this.f17348d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.f17349e.s().edit();
        editorEdit.putLong(this.f17345a, j);
        editorEdit.apply();
        this.f17348d = j;
    }
}
