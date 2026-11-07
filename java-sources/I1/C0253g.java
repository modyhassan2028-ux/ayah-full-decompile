package I1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: I1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0253g implements InterfaceC0251f, InterfaceC0255h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3732a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f3733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f3736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f3737f;

    public /* synthetic */ C0253g() {
    }

    @Override // I1.InterfaceC0251f
    public void a(Uri uri) {
        this.f3736e = uri;
    }

    @Override // I1.InterfaceC0251f
    public void b(int i10) {
        this.f3735d = i10;
    }

    @Override // I1.InterfaceC0251f
    public C0256i build() {
        return new C0256i(new C0253g(this));
    }

    @Override // I1.InterfaceC0255h
    public int e() {
        return this.f3735d;
    }

    @Override // I1.InterfaceC0255h
    public ClipData f() {
        return this.f3733b;
    }

    @Override // I1.InterfaceC0255h
    public ContentInfo g() {
        return null;
    }

    @Override // I1.InterfaceC0255h
    public int h() {
        return this.f3734c;
    }

    @Override // I1.InterfaceC0251f
    public void setExtras(Bundle bundle) {
        this.f3737f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f3732a) {
            case 1:
                Uri uri = this.f3736e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f3733b.getDescription());
                sb.append(", source=");
                int i10 = this.f3734c;
                if (i10 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i10 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i10 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i10 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i10 != 4) {
                    strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i11 = this.f3735d;
                sb.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return android.support.v4.media.session.p.B(sb, this.f3737f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public C0253g(C0253g c0253g) {
        ClipData clipData = c0253g.f3733b;
        clipData.getClass();
        this.f3733b = clipData;
        int i10 = c0253g.f3734c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f3734c = i10;
        int i11 = c0253g.f3735d;
        if ((i11 & 1) == i11) {
            this.f3735d = i11;
            this.f3736e = c0253g.f3736e;
            this.f3737f = c0253g.f3737f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
