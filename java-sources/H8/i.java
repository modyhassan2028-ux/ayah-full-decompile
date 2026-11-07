package H8;

import android.content.Context;
import com.ayah.common.ui.view.QuranAyahTextView;
import p110k9.y;
import p180s0.F;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f3605s;

    public /* synthetic */ i(long j, int i10) {
        this.f3604r = i10;
        this.f3605s = j;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f3604r) {
            case 0:
                ((X1.b) obj).e(j.f3606b, Long.valueOf(this.f3605s));
                return null;
            case 1:
                Context context = (Context) obj;
                p251z9.j.e(context, "ctx");
                QuranAyahTextView quranAyahTextView = new QuranAyahTextView(context);
                quranAyahTextView.setTextSize(2, 22.0f);
                quranAyahTextView.setTextColor(F.u(this.f3605s));
                quranAyahTextView.setGravity(17);
                return quranAyahTextView;
            case 2:
                p196u0.d dVar = (p196u0.d) obj;
                p251z9.j.e(dVar, "$this$Canvas");
                dVar.W(this.f3605s, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (240 & 8) != 0 ? 0.0f : 0.0f, (240 & 16) != 0 ? 0 : 0, 3);
                return y.f19095a;
            default:
                p196u0.d dVar2 = (p196u0.d) obj;
                p251z9.j.e(dVar2, "$this$Canvas");
                dVar2.W(this.f3605s, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (240 & 8) != 0 ? 0.0f : 0.0f, (240 & 16) != 0 ? 0 : 0, 3);
                return y.f19095a;
        }
    }
}
