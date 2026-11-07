package I5;

import A.C0030l0;
import K9.AbstractC0405x;
import android.content.Intent;
import com.ayah.feature.reciterlist.RecitersActivity;
import com.ayah.feature.reciterlist.qari.QariAudioActivity;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ RecitersActivity f3849s;

    public /* synthetic */ b(RecitersActivity recitersActivity, int i10) {
        this.f3848r = i10;
        this.f3849s = recitersActivity;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f3848r;
        y yVar = y.f19095a;
        RecitersActivity recitersActivity = this.f3849s;
        p065g3.a aVar = (p065g3.a) obj;
        switch (i10) {
            case 0:
                int i11 = RecitersActivity.f13853Z;
                j.e(aVar, "it");
                AbstractC0405x.x(recitersActivity.f13854W, null, new C0030l0(recitersActivity, aVar, null, 16), 3);
                break;
            default:
                int i12 = RecitersActivity.f13853Z;
                j.e(aVar, "it");
                recitersActivity.getClass();
                Intent intent = new Intent(recitersActivity, (Class<?>) QariAudioActivity.class);
                intent.putExtra("reciterId", aVar.f16273a);
                recitersActivity.startActivity(intent);
                break;
        }
        return yVar;
    }
}
