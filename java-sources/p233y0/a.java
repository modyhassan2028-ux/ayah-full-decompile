package p233y0;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.media.session.p;
import org.xmlpull.v1.XmlPullParser;
import p151p.V;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f24615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24616b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f24617c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f24615a = xmlResourceParser;
        V v10 = new V();
        v10.f20603r = new float[64];
        this.f24617c = v10;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f3) {
        if (p244z1.a.f(this.f24615a, str)) {
            f3 = typedArray.getFloat(i10, f3);
        }
        b(typedArray.getChangingConfigurations());
        return f3;
    }

    public final void b(int i10) {
        this.f24616b = i10 | this.f24616b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f24615a, aVar.f24615a) && this.f24616b == aVar.f24616b;
    }

    public final int hashCode() {
        return (this.f24615a.hashCode() * 31) + this.f24616b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f24615a);
        sb.append(", config=");
        return p.A(sb, this.f24616b, ')');
    }
}
