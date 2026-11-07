package A4;

import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.navigator.NavigationWrapper;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NumberFormat f518s;

    public /* synthetic */ e(NumberFormat numberFormat, int i10) {
        this.f517r = i10;
        this.f518s = numberFormat;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f517r;
        NumberFormat numberFormat = this.f518s;
        Integer num = (Integer) obj;
        num.intValue();
        switch (i10) {
            case 0:
                int i11 = AudioConfigWrapper.f13759u;
                String str = numberFormat.format(num);
                p251z9.j.d(str, "format(...)");
                return str;
            case 1:
                int i12 = NavigationWrapper.f13816u;
                String str2 = numberFormat.format(num);
                p251z9.j.d(str2, "format(...)");
                return str2;
            default:
                int i13 = NavigationWrapper.f13816u;
                String str3 = numberFormat.format(num);
                p251z9.j.d(str3, "format(...)");
                return str3;
        }
    }
}
