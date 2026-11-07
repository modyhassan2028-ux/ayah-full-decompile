package X2;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9875a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f7 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f10 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fN = android.support.v4.media.session.p.n(f10, f7, f3, f7);
        float fN2 = android.support.v4.media.session.p.n(fPow4, fPow, f3, fPow);
        float fN3 = android.support.v4.media.session.p.n(fPow5, fPow2, f3, fPow2);
        float fN4 = android.support.v4.media.session.p.n(fPow6, fPow3, f3, fPow3);
        float fPow7 = ((float) Math.pow(fN2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fN3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fN4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fN * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
