package p151p;

import B1.d;
import L5.c;
import Z0.B;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p013b2.j;
import p034d2.b;
import p034d2.e;
import p034d2.h;
import p073h.a;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f20504d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20505a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f20506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20507c;

    public /* synthetic */ A() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((c) ((B) this.f20507c).f10875s).getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i10) {
        switch (this.f20505a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f20506b;
                i iVarB = i.B(absSeekBar.getContext(), attributeSet, f20504d, i10);
                Drawable drawableS = iVarB.s(0);
                if (drawableS != null) {
                    if (drawableS instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableS;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i11), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableS = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableS);
                }
                Drawable drawableS2 = iVarB.s(1);
                if (drawableS2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableS2, false));
                }
                iVarB.C();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f20506b).getContext().obtainStyledAttributes(attributeSet, a.j, i10, 0);
                try {
                    boolean z10 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public b c(InputConnection inputConnection, EditorInfo editorInfo) {
        B b5 = (B) this.f20507c;
        if (inputConnection == null) {
            b5.getClass();
            inputConnection = null;
        } else {
            c cVar = (c) b5.f10875s;
            cVar.getClass();
            if (!(inputConnection instanceof b)) {
                inputConnection = new b((EditText) cVar.f5532s, inputConnection, editorInfo);
            }
        }
        return (b) inputConnection;
    }

    public void d(boolean z10) {
        p034d2.i iVar = (p034d2.i) ((c) ((B) this.f20507c).f10875s).f5533t;
        if (iVar.f15572t != z10) {
            if (iVar.f15571s != null) {
                j jVarA = j.a();
                h hVar = iVar.f15571s;
                jVarA.getClass();
                B0.c.i(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f13158a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f13159b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f15572t = z10;
            if (z10) {
                p034d2.i.a(iVar.f15570r, j.a().c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z10) {
        if (drawable instanceof B1.c) {
            ((d) ((B1.c) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id = layerDrawable.getId(i10);
                    drawableArr[i10] = e(layerDrawable.getDrawable(i10), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                    layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                    layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                    layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                    layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                    layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                    layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                    layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                    layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f20507c) == null) {
                    this.f20507c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public A(AbsSeekBar absSeekBar) {
        this.f20506b = absSeekBar;
    }

    public A(EditText editText) {
        this.f20506b = editText;
        this.f20507c = new B(editText);
    }
}
