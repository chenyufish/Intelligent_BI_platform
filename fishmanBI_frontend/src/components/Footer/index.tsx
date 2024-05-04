import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-components';
import React from 'react';

const Footer: React.FC = () => {
    return (
        <DefaultFooter
            style={{
                background: 'none',
            }}
            links={[
                {
                    key: 'Ant Design Pro',
                    title: 'fishman的小池塘',
                    href: 'https://fishmanon.cn',
                    blankTarget: true,
                },
                {
                    key: 'github',
                    title: <GithubOutlined/>,
                    href: 'https://github.com/chenyufish/Intelligent_BI_platform',
                    blankTarget: true,
                },
                {
                    key: 'Fishman',
                    title: 'Ant Design',
                    href: 'https://github.com/chenyufish/Intelligent_BI_platform',
                    blankTarget: true,
                },
            ]}
        />
    );
};

export default Footer;
