package P9;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class t implements p013b2.p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6805s;

    @Override // p013b2.p
    public boolean b(CharSequence charSequence, int i10, int i11, p013b2.x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f6805s)) {
            return true;
        }
        xVar.f13199c = (xVar.f13199c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f6804r) {
            case 0:
                return p245z2.a.F(new StringBuilder("<"), this.f6805s, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(String str, int i10) {
        this.f6804r = i10;
        this.f6805s = str;
    }

    @Override // p013b2.p
    public Object a() {
        return this;
    }
}
