//
//  GTMCallback.h
//  gtmtests
//
//  Created by developer on 07/10/22.
//

#ifndef GTMCallback_h
#define GTMCallback_h

#import <Foundation/Foundation.h>
#import <GoogleTagManager/TAGCustomFunction.h>

@interface GTMCallback : NSObject <TAGCustomFunction>

- (NSObject*)executeWithParameters:(NSDictionary*)parameters;

@end

#endif /* GTMCallback_h */
