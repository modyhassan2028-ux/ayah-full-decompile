package p056f2;

import B9.a;
import L5.c;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.ayah.R;
import p251z9.j;

/* JADX INFO: renamed from: f2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0934g extends AbstractC0939l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f16092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16093t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f16094u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934g(X x9, boolean z10) {
        super(x9);
        j.e(x9, "operation");
        this.f16092s = z10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[Catch: RuntimeException -> 0x00eb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00eb, blocks: (B:78:0x00df, B:80:0x00e5), top: B:91:0x00df }] */
    public final c p(Context context) {
        int i10;
        c cVar;
        Animator animatorLoadAnimator;
        int iB0;
        if (this.f16093t) {
            return this.f16094u;
        }
        X x9 = (X) this.f16104r;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = x9.f16041c;
        boolean z10 = x9.f16039a == 2;
        C0946t c0946t = abstractComponentCallbacksC0947u.f16148a0;
        int i11 = c0946t == null ? 0 : c0946t.f16122f;
        if (this.f16092s) {
            if (z10) {
                if (c0946t == null) {
                    i10 = 0;
                } else {
                    i10 = c0946t.f16120d;
                }
            } else if (c0946t == null) {
                i10 = 0;
            } else {
                i10 = c0946t.f16121e;
            }
        } else if (z10) {
            if (c0946t == null) {
                i10 = 0;
            } else {
                i10 = c0946t.f16118b;
            }
        } else if (c0946t == null) {
            i10 = 0;
        } else {
            i10 = c0946t.f16119c;
        }
        abstractComponentCallbacksC0947u.O(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0947u.f16144W;
        c cVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0947u.f16144W.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0947u.f16144W;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i10 == 0 && i11 != 0) {
                if (i11 == 4097) {
                    iB0 = z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i11 == 8194) {
                    iB0 = z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i11 == 8197) {
                    iB0 = z10 ? a.b0(context, android.R.attr.activityCloseEnterAnimation) : a.b0(context, android.R.attr.activityCloseExitAnimation);
                } else if (i11 == 4099) {
                    iB0 = z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i11 != 4100) {
                    iB0 = -1;
                } else {
                    iB0 = z10 ? a.b0(context, android.R.attr.activityOpenEnterAnimation) : a.b0(context, android.R.attr.activityOpenExitAnimation);
                }
                i10 = iB0;
            }
            if (i10 != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i10));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i10);
                        if (animationLoadAnimation != null) {
                            cVar = new c(animationLoadAnimation);
                            cVar2 = cVar;
                        }
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                            if (animatorLoadAnimator != null) {
                                cVar = new c(animatorLoadAnimator);
                                cVar2 = cVar;
                            }
                        } catch (RuntimeException e11) {
                            if (zEquals) {
                                throw e11;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i10);
                            if (animationLoadAnimation2 != null) {
                                cVar2 = new c(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
                    if (animatorLoadAnimator != null) {
                        cVar = new c(animatorLoadAnimator);
                        cVar2 = cVar;
                    }
                }
            }
        }
        this.f16094u = cVar2;
        this.f16093t = true;
        return cVar2;
    }
}
